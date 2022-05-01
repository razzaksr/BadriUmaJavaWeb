import React, {useState, useEffect} from 'react';
import { Link } from 'react-router-dom';
import './Home.css';
import { toast } from 'react-toastify';

const Home = () => {
  const [data, setData] = useState({});

  const onDelete = (id) => {
    if(window.confirm("are you sure?")){
      
    }
  }
  useEffect(() => {
    
  }, []);
  return (
    <div className={{marginTop: "1000px"}}>
      <table className='styled-table'>
      <thead>
        <tr>
          <th style={{textAlign: "center"}}>No.</th>
          <th style={{textAlign: "center"}}>Name</th>
          <th style={{textAlign: "center"}}>Email</th>
          <th style={{textAlign: "center"}}>Contact</th>
          <th style={{textAlign: "center"}}>Action</th>
        </tr>
      </thead>
      <tbody>
        {Object.keys(data).map((id, index) => {
          return (
            <tr key={id}>
              <th scope='row'>{index + 1}</th>
              <td>{data[id].name}</td>
              <td>{data[id].email}</td>
              <td>{data[id].contact}</td>
              <td>
                <Link to={`/update/${id}`}>
                  <button className='btn btn-edit'>Edit</button>
                </Link>
                <button className='btn btn-delete' onClick={() => onDelete(id)}>Delete</button>
                <Link to={`/view/${id}`}>
                  <button className='btn btn-view'>View</button>
                </Link>
              </td>
            </tr>
          )
        })}
      </tbody>
      </table>
    </div>
  )
}

export default Home