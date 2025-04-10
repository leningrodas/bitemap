import React, { useState } from 'react';
import { Button, Container, TextField, Box } from '@mui/material';
import { Link, useNavigate } from 'react-router-dom';
import AppNavbar from './AppNavbar';

const InformationInput = () => {
    const initialFormState = {
        name: '',
        description: '',
        price: ''
    };

    const [product, setProduct] = useState(initialFormState);
    const navigate = useNavigate();

    const isAlphabetic = (value) => /^[A-Za-z\s]+$/.test(value);
    const isNumeric = (value) => /^[0-9]+$/.test(value);

    const handleChange = (event) => {
        const { name, value } = event.target;
        setProduct({ ...product, [name]: value });
    };

const isNameInvalid = product.name.length > 0 && !isAlphabetic(product.name);
const isDescriptionInvalid = product.description.length > 0 && !isAlphabetic(product.description);
const isPriceInvalid = product.price.length > 0 && !isNumeric(product.price);

 const handleSubmit = async (event) => {
     event.preventDefault();

     if (isNameInvalid || isDescriptionInvalid || isPriceInvalid) {
         return;
     }

     try {
         const response = await fetch('http://localhost:8080/api/products', {
             method: 'POST',
             headers: {
                 'Content-Type': 'application/json'
             },
             body: JSON.stringify({ ...product, price: parseFloat(product.price) }) // ✅ right here
         });

         if (!response.ok) {
             throw new Error('Failed to save product');
         }

         const savedProduct = await response.json();
         console.log('Saved product:', savedProduct);
         navigate('/products');
     } catch (error) {
         console.error('Error submitting product:', error);
     }
 };

    const title = <h2>Add Product</h2>;

    return (
        <div>
            <AppNavbar />
            <Container maxWidth="sm">
                {title}
                <Box component="form" onSubmit={handleSubmit} noValidate sx={{ mt: 2 }}>
                    <TextField
                        fullWidth
                        margin="normal"
                        label="Name"
                        name="name"
                        value={product.name}
                        onChange={handleChange}
                        error={isNameInvalid}
                      helperText={isNameInvalid ? "Only letters and spaces are allowed." : ""}
                    />
                    <TextField
                        fullWidth
                        margin="normal"
                        label="Description"
                        name="description"
                        value={product.description}
                        onChange={handleChange}
                        error={isDescriptionInvalid}
                        helperText={isDescriptionInvalid ? "Only letters and spaces are allowed." : ""}
                    />
                    <TextField
                        fullWidth
                        margin="normal"
                        label="Price"
                        name="price"
                        value={product.price}
                        onChange={handleChange}
                        error={isPriceInvalid}
                        helperText={isPriceInvalid ? "Only numeric values are allowed." : ""}
                    />
                    <Box sx={{ mt: 2 }}>
                        <Button variant="contained" color="primary" type="submit" sx={{ mr: 2 }}>
                            Save
                        </Button>
                        <Button component={Link} to="/products" variant="outlined" color="secondary">
                            Cancel
                        </Button>
                    </Box>
                </Box>
            </Container>
        </div>
    );
};

export default InformationInput;
