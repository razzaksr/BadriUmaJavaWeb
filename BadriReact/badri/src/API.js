import axios from 'axios'

const url="http://localhost:8080"

export const deleting=async(id)=>{
    const t = await axios.delete(`${url}/${id}`)
    return t;
}

export const editing=async(obj)=>{
    const t = await axios.put(`${url}/`,obj)
    return t;
}

export const reading=async(id)=>{
    const t = await axios.get(`${url}/${id}`)
    return t;
}

export const viewing=async()=>{
    const t = await axios.get(`${url}/`)
    return t;
}

export const adding=async(obj)=>{
    const t = await axios.post(`${url}/`,obj)
    return t;
}