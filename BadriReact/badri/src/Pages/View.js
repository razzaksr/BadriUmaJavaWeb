import React,{useState, useEffect} from 'react';
import { useParams, Link } from 'react-router-dom';
import { reading } from '../API';
import './view.css'

const View = () => {
  const [users, setUser] = useState({});

  const { id } = useParams();

  const calRead=async()=>{
    const t = await reading(id)
    setUser(t.data)
}

useEffect(()=>{
    calRead()
},[])
  
  // console.log(id);
  
  return (
    <div style={{marginTop: "150px"}}>
    <div className='card'>
    <div className='card-header'>
      <p>User conatct Detais</p>
    </div>
    <div className='container'>
      <strong>ID: </strong>
      <span>{id}</span>
      <br />
      <br />
      <strong>Name: </strong>
      <span>{users ? users.name : ""}</span>
      <br />
      <br />
      <strong>Email: </strong>
      <span>{users ? users.email : ""}</span>
      <br />
      <br />
      <strong>Contact: </strong>
      <span>{users ? users.contact : ""}</span>
      <br />
      <br />
      <Link to="/">
        <button className='btn btn-edit'>Go Back</button>
      </Link>
    </div>
  </div>

    </div>
  )
}

export default View