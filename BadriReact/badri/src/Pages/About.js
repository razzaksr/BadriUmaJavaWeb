import React from 'react';
import { Link } from 'react-router-dom';

const About = () => {
  return (
    <div className='about'>
      <h1>Welcome Gang!!!</h1>
      <Link to="/">
        <button className='btn btn-edit'>Go Back</button>
      </Link>
    </div>
  )
}

export default About;