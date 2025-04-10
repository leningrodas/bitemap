import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Root from './Root'; // ✅ import Root instead of App
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <Root /> {/* ✅ Use Root here so all routes are available */}
    </React.StrictMode>
);

reportWebVitals();
