import { BrowserRouter, Routes, Route } from "react-router-dom";
import './App.css';
import Home from "./Pages/Home";
import AddEdit from './Pages/AddEdit';
import View from './Pages/View';
import About from './Pages/About';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Header from "./Components/Header";



function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <Header/>
        <ToastContainer position="top-center" />
        <Routes>
          <Route path="/" element ={<Home/>}/>
          <Route path="/add" element ={<AddEdit/>}/>
          <Route path="/update/:id" element ={<AddEdit/>}/>
          <Route path="/view/:id" element ={<View/>}/>
          <Route path="/about" element ={<About/>}/>
        </Routes>
      </div>
    </BrowserRouter>
    
  );
}

export default App;
