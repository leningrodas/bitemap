import React, { useState } from 'react';
import '../styles/signUpButton.css'; // Your styles

const SignUpButtons = () => {
  // ✅ This line declares the state and fixes both errors!
  const [selectedOption, setSelectedOption] = useState('');

  const handleDropdownChange = (e) => {
    setSelectedOption(e.target.value); // ✅ This updates the selectedOption state
    console.log('Selected:', e.target.value);
  };

  const handleLogin = () => {
    console.log('Login button clicked');
  };

  const handleOpenApp = () => {
    console.log('Sign Up button clicked');
  };

  return (
    <div className="button-row">
      <select styles="margin-right: 90em;" onChange={handleDropdownChange} value={selectedOption}>
        <option value="">Select</option>
        <option value="user">User</option>
        <option value="admin">Admin</option>
        <option value="guest">Guest</option>
      </select>

       <div className="button-group">
         <button onClick={handleLogin}>Login</button>
         <button onClick={handleOpenApp}>Sign Up</button>
       </div>
    </div>
  );
};

export default SignUpButtons;
