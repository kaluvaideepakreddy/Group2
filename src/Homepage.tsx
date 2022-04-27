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

const mystyle = {
    padding:"50px"
}

const Homepage = (props:any) => {
    const navigate = useNavigate();

    return (

        <>
            <div>

                <Box sx={{ flexGrow: 1 }}>
                    <AppBar position="static">
                        <Toolbar>
                            <IconButton

                                size="large"
                                edge="start"
                                color="inherit"
                                aria-label="menu"
                                sx={{ mr: 2 }}
                            >
                                <MenuIcon />
                            </IconButton>
                            <Typography

                                variant="h6" component="div" sx={{ flexGrow: 1 }}>
                                Movies
                            </Typography>
                            <Button color="inherit" onClick={()=> navigate('/')}>Home</Button>
                        </Toolbar>
                    </AppBar>
                </Box>

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

export default Homepage;