import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import App from './App';
import ProductList from './components/ProductList';

function Root() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<App />} />
                <Route path="/products" element={<ProductList />} />
            </Routes>
        </Router>
    );
}

export default Root;