import React, {useState, useEffect} from 'react';
import {Link, useLocation} from 'react-router-dom';
import './Header.css';

function Header() {
    const [activeTab, setActiveTab] = useState("Home");
    const location = useLocation();

    useEffect(() => {
        if(location.pathname==="/"){
            setActiveTab("Home")
        }
        else if(location.pathname==="/add"){
            setActiveTab("add")
        }else if(location.pathname==="/about"){
            setActiveTab("about")
        }
    },[location])
  return (
    <div className='header'>
        <p className='logo'>CRUD</p>
        <div className='header-right'>
            <Link to="/">
                <p className={`${activeTab === "Home" ? "active" : ""}`} onClick={() => setActiveTab("Home")}>
                    Home
                </p>
            </Link>
            <Link to="/add">
                <p className={`${activeTab === "add" ? "active" : ""}`} onClick={() => setActiveTab("add")}>
                    Add
                </p>
            </Link>
            <Link to="/about">
                <p className={`${activeTab === "about" ? "active" : ""}`} onClick={() => setActiveTab("about")}>
                    About
                </p>
            </Link>
        </div>
    </div>
  )
}

export default Header