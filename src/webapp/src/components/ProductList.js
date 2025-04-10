import React, { useEffect, useState } from 'react';

function ProductList() {
    const [products, setProducts] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/products')
            .then(response => response.json())
            .then(data => {
                console.log("Fetched products:", data); // Log this
                setProducts(data)
            })
            .catch(error => console.error('Error fetching product:', error));
    }, []);

    return (
        <div>
            <h2>Products</h2>
            <ul>
                {products.map(product => (
                    <li key={product.id}>
                        <strong>{product.name}</strong><br />
                        <span>{product.description}</span><br />
                        <span>{product.price}</span>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ProductList;
