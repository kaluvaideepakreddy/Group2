import React from "react";
import { useNavigate } from "react-router-dom";
import './Login.css';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import Navbar from "./Navbar";

const mystyle = {
    padding:"50px"
}

const Home = (props:any) => {
    const navigate = useNavigate();

    return (

        <>
            <div>

                <Navbar/>

            </div>
            <div className="h1"> <h1>IMAX Cinemas</h1> </div>
            <div className={"row"} >
                <div className={"column"}>
                    <img src={require('./images/RRR.jpg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=> navigate('/Day1')}/>
                    <img src={require('./images/Pushpa.jpg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=>navigate('/Movie2')}/>
                    <img src={require('./images/KGF.jpg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=>navigate('/Movie3')}/>
                    <img src={require('./images/Bahubali.jpg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=>navigate('/Movie4')}/>
                </div>
            </div>
        </>
    );
};

export default Home;