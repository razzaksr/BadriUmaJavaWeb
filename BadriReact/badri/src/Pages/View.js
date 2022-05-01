import React,{useState, useEffect} from 'react';
import fireDb from "../firebase";
import { useParams, Link } from 'react-router-dom';
import './view.css'

const View = () => {
  const [users, setUser] = useState();

  const { id } = useParams();

  useEffect(() => {
    fireDb
      .child(`contacts/${id}`)
      .get()
      .then((snapshot) => {
        if(snapshot.exists()){
          setUser({ ...snapshot.val() });
        }
        else{
          setUser({});
        }
    });
    
  }, [id]);

  
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