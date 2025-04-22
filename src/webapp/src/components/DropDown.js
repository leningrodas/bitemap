import React from 'react';

const Dropdown = ({ options, onChange, value }) => {
  return (
    <select onChange={onChange} value={value}>
      <option value="">Select</option>
      {options.map((opt) => (
        <option key={opt} value={opt}>{opt}</option>
      ))}
    </select>
  );
};

export default Dropdown;
