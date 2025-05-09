import React from 'react';
import '../styles/homePage.css'; // Optional styles
import InformationInput from './InformationInput';
const HomePage = () => {
    return (
        <div className="homepage-container">
            <main>
                <p className="homepage-text">
                    Welcome to my simple React home page with Google Maps and Places Autocomplete!
                </p>
                <InformationInput />
            </main>
        </div>
    );
};

export default HomePage;