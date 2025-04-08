import React from 'react';
import { APIProvider, Map } from '@vis.gl/react-google-maps';

const GoogleMaps = () => {
 console.log("Google Maps API Key:", process.env.REACT_APP_GOOGLE_MAPS_KEY);
    return (
        <APIProvider apiKey={process.env.REACT_APP_GOOGLE_MAPS_KEY}>
            <Map
                style={{ width: '100vw', height: '100vh' }}
                defaultCenter={{ lat: 40.749933, lng: -73.98633 }}
                defaultZoom={13}
                gestureHandling="greedy"
                disableDefaultUI={false}
            />
        </APIProvider>
    );
};

export default GoogleMaps;