import axios from 'axios'

const url="http://localhost:8080"

export const adding=async(obj)=>{
    const t = await axios.post(`${url}/`,obj)
    return t;
}