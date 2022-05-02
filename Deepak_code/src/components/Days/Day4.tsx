import React, {useState} from "react";

import Dates from "../Dates";
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";

function Movie1() {
    return (
        <div>
            <Dates/>
            <Stack direction="column" spacing={4} style={{padding: "20px",alignItems:"center"}}>
                <h1> Screen 1 </h1>
                <Stack direction="row" spacing={4} >
                    <Button variant="outlined">11:15</Button>
                    <Button variant="outlined"> 2:30</Button>
                    <Button variant="outlined"> 6:00</Button>
                    <Button variant="outlined"> 9:30 </Button>
                </Stack>
            </Stack>
        </div>
    )
}

export default Movie1;