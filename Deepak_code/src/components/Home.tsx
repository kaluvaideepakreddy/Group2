import React from "react";
import { useNavigate } from "react-router-dom";
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";
import Dates from "./Dates";

const mystyle = {
    padding:"50px"
}

const Home = (props:any) => {
    const navigate = useNavigate();

    return (
        <>
            <div className={"row"} >
                <div className={"column"}>
                    <img src={require('./Images/RRR.jpeg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=> navigate('/Movie1')}/>
                    <img src={require('./Images/BB2.jpeg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=> navigate('/Movie2')}/>
                    <img src={require('./Images/Kgf.jpeg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=>navigate('/Movie3')}/>
                    <img src={require('./Images/pushpa.jpeg')} alt={"icon"} height={300} width={200} style={mystyle} onClick={()=>navigate('/Movie4')}/>
                </div>
            </div>
        </>
    );
};

export default Home;