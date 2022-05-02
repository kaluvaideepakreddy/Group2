import React from "react";

import { useNavigate } from "react-router-dom";
import Dates from "../Dates";
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";

function Day2() {
    const navigate = useNavigate();
    return (
        <div>
            <Dates/>
            <Stack direction="column" spacing={4} style={{padding: "20px",alignItems:"center"}}>
                <h1> Screen 1 </h1>
                <Stack direction="row" spacing={4} >
                    <Button variant="outlined">hello</Button>
                    <Button variant="outlined"> one </Button>
                    <Button variant="outlined"> two </Button>
                    <Button variant="outlined"> three </Button>
                    <Button variant="outlined"> four </Button>
                </Stack>
                <h1>  Screen 2</h1>
                <Stack direction="row" spacing={4} >
                    <Button variant="outlined">hello</Button>
                    <Button variant="outlined"> one </Button>
                    <Button variant="outlined"> two </Button>
                    <Button variant="outlined"> three </Button>
                    <Button variant="outlined"> three </Button>
                </Stack>
            </Stack>
        </div>
    )
}

export default Day2;