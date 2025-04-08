import React from 'react';
import { APIProvider, Map } from '@vis.gl/react-google-maps';

const GoogleMaps = () => {
    return (
        <APIProvider apiKey="AIzaSyDnS_n0GA4PA5poHnuREl-_IwflhaC1Fq4">
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