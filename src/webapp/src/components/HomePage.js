import React from 'react';
import '../styles/homePage.css'; // Optional styles

const HomePage = () => {
    return (
        <div className="homepage-container">
            <main>
                <p className="homepage-text">
                    Welcome to my simple React home page with Google Maps and Places Autocomplete!
                </p>

                {/* Google Maps API Loader Web Component */}
                <gmpx-api-loader
                    key="AIzaSyAqLyJXXj4nB16jw2ZesQfVPihv8r5POzM"
                    solution-channel="GMP_GE_mapsandplacesautocomplete_v2"
                ></gmpx-api-loader>

                {/* Google Map Web Component */}
                <gmp-map
                    center="40.749933,-73.98633"
                    zoom="13"
                    map-id="DEMO_MAP_ID"
                    style={{ width: '100%', height: '500px', marginTop: '1rem' }}
                >
                    <div slot="control-block-start-inline-start" className="place-picker-container">
                        <gmpx-place-picker placeholder="Enter an address"></gmpx-place-picker>
                    </div>

                    <gmp-advanced-marker></gmp-advanced-marker>
                </gmp-map>
            </main>
        </div>
    );
};

export default HomePage;