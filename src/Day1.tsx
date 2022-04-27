import React from "react";
import Button from "@mui/material/Button";
import Stack from "@mui/material/Stack";
import {useNavigate} from "react-router-dom";
const mystyle = {
    padding:"50px"
}

function Day1(){
    const navigate = useNavigate();
    return(
        <div>
            <Stack direction="row" spacing={4} style={{padding:"20px"}}>
                <Stack direction="row" spacing={4} style={{padding:"20px"}}>
                    <Button onClick={()=> navigate('/Day1')} variant="outlined" > Jan 1 </Button>
                    <Button onClick={()=> navigate('/Day2')} variant="outlined" > Jan 2 </Button>
                    <Button onClick={()=> navigate('/Day3')} variant="outlined" > Jan 3 </Button>
                    <Button onClick={()=> navigate('/Day4')} variant="outlined" > Jan 4 </Button>
                    <Button onClick={()=> navigate('/Day5')} variant="outlined" > Jan 5 </Button>
                    <Button onClick={()=> navigate('/Day6')} variant="outlined" > Jan 6 </Button>
                    <Button onClick={()=> navigate('/Day7')} variant="outlined" > Jan 7 </Button>
                </Stack>
            </Stack>
            <img className="image" src={require('./images/RRR.jpg')} alt={"icon"} height={300} width={200} style={mystyle}/>
            <h1 className="Screen">Screen 1</h1>
            <button className="moviebtn">
                11:00
            </button>

            <button className="moviebtn">
                6:00
            </button>
            <button className="moviebtn">
                9:00
            </button>
            <h1 className="Screen">Screen 2</h1>
            <button className="moviebtn">
                11:00
            </button>
            <button className="moviebtn">
                2:00
            </button>
            <button className="moviebtn">
                6:00
            </button>
            <button className="moviebtn">
                9:00
            </button>
            <h1 className="Screen">Screen 3</h1>
            <button className="moviebtn">
                11:00
            </button>
            <button className="moviebtn">
                2:00
            </button>
            <button className="moviebtn">
                6:00
            </button>
            <button className="moviebtn">
                9:00
            </button>
        </div>
    )
}

export default Day1;