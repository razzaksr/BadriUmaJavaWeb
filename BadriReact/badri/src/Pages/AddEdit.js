import React,{useState, useEffect} from 'react';
import './AddEdit.css';
import { adding } from '../API';

const initialState = {
  name:"",
  email:"",
  contact:0
}

const AddEdit = () => {
  const [state, setState ] = useState(initialState);

  const hey=(eve)=>
  {
    const{name,value}=eve.target
    setState((old)=>{
      return{
        ...old,
        [name]:value
      }
    })
  }

  const sub=async()=>{
    alert(JSON.stringify(state))
    const t = await adding(state)
    alert(t.data)
    setState(initialState)
  }

  const res=()=>{
    setState(initialState)
  }

  return(
    <>
      <div className='container-fluid'>
        <div className='row justify-content-center'>
          <div className='col-lg-6 col-md-8 col-sm-12 shadow p-3'>
            <div className='form-group'>
              <label>Name of the contact</label>
              <input type="text" name="name" value={state.name} className="form-control" onChange={hey}/>
            </div>
            <div className='form-group'>
              <label>Mobile number of the contact</label>
              <input type="text" name="contact" value={state.contact} className="form-control" onChange={hey}/>
            </div>
            <div className='form-group'>
              <label>Email of the contact</label>
              <input type="email" name="email" value={state.email} className="form-control" onChange={hey}/>
            </div>
            <div className='row justify-content-around'>
              <button className='btn btn-outline-success col-1' onClick={sub}>
                <i class="bi bi-cloud-plus-fill"></i>
              </button>
              <button className='btn btn-outline-dark col-1' onClick={res}>
                <i class="bi bi-x-circle-fill"></i>
              </button>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default AddEdit