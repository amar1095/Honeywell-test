import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [cities, setCities] = useState([]);
  const [selectedCity1, setSelectedCity1] = useState(null);
  const [selectedCity2, setSelectedCity2] = useState(null);
  const [path, setPath] = useState([]);

  useEffect(() => {
    const fetchCities = async () => {
      try {
        const response = await axios.get('http://localhost:8080/getAllCities');
        setCities(response.data);
      } catch (error) {
        console.error('Error fetching cities:', error);
      }
    };

    fetchCities();
  }, []);

  const handleCity1Change = (e) => {
    setSelectedCity1(e.target.value);
  };

  const handleCity2Change = (e) => {
    setSelectedCity2(e.target.value);
  };

  const findPath = async () => {
    try {
      const response = await axios.get(`http://localhost:8080/findPath?city1=${selectedCity1}&city2=${selectedCity2}`);
      setPath(response.data);
    } catch (error) {
      console.error('Error finding path:', error);
    }
  };

  return (
    <div>
      <h1>City Path Finder</h1>
      <div>
        <h2>Select Cities</h2>
        <select value={selectedCity1} onChange={handleCity1Change}>
          <option value="">Select City 1</option>
          {cities.map(city => (
            <option key={city.name} value={city.name}>{city.name}</option>
          ))}
        </select>
        <select value={selectedCity2} onChange={handleCity2Change}>
          <option value="">Select City 2</option>
          {cities.map(city => (
            <option key={city.name} value={city.name}>{city.name}</option>
          ))}
        </select>
        <button onClick={findPath}>Find Path</button>
      </div>
      <div>
        <h2>Path</h2>
        <p>{path.join(' -> ')}</p>
      </div>
    </div>
  );
}

export default App;

