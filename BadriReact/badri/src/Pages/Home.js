import React, {useState, useEffect} from 'react';
import { Link } from 'react-router-dom';
import './Home.css';
import { toast } from 'react-toastify';
import { deleting, viewing } from '../API';

const Home = () => {

  const[all,setAll]=useState([])

  const fun=async()=>{
    const t = await viewing()
    setAll(t.data)
  }

  const onDelete = async(id) => {
    if(window.confirm("are you sure?")){
      const t = await deleting(id)
      alert(t.data)
    }
    else{
      alert("I've changed my mind")
    }
    window.location.assign("/")
  }
  useEffect(() => {
    fun()
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
        {all.map((data,index) => {
          return (
            <tr>
              <th scope='row'>{data.contId}</th>
              <td>{data.name}</td>
              <td>{data.email}</td>
              <td>{data.contact}</td>
              <td>
                <Link to={`/update/${data.contId}`}>
                  <button className='btn btn-warning'>Edit</button>
                </Link>
                <button className='btn btn-danger' onClick={() => onDelete(data.contId)}>Delete</button>
                <Link to={`/view/${data.contId}`}>
                  <button className='btn btn-info'>View</button>
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