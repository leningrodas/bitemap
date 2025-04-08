import React from 'react';
import HomePage from './components/HomePage';
import Header from './components/Header';
import Footer from './components/Footer'
import './styles/stylesheet.css';
import GoogleMaps from "./components/GoogleMaps";

function App() {
  return (
      <div>
       <Header />
       <HomePage />
       <GoogleMaps />
       <Footer />
      </div>
  );
}


export default App;
