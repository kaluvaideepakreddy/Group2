
import React from "react";
import {useNavigate} from "react-router-dom";
import Stack from "@mui/material/Stack";
import Button from "@mui/material/Button";

function addDays(date:any, days:any) {
    var result = new Date(date);
    result.setDate(result.getDate() + days);
    return result;
}
function Dates() {
    const navigate = useNavigate();
    const current = new Date();
    const date = current.getDate();
    const day2 = addDays(current,1);
    const day3 = addDays(current,2);
    const day4 = addDays(current,3);
    const month = current.toLocaleString("en-us", {month: "short"})

    return (
        <div>
            <Stack direction="row" spacing={4} style={{padding:"40px"}}>
            <Button variant="outlined" onClick={()=>navigate('/day1')}>
                {date + " " + month}
            </Button>
            <Button variant="outlined" onClick={()=>navigate('/day2')}>
                {day2.getDate()  + " " + day2.toLocaleString("en-us", {month: "short"})}
            </Button>
            <Button variant="outlined" onClick={()=>navigate('/day3')}>
                {day3.getDate()+ " " + day3.toLocaleString("en-us", {month: "short"})}
            </Button>
            <Button variant="outlined" onClick={()=>navigate('/day4')}>
                {day4.getDate() + " " + day4.toLocaleString("en-us", {month: "short"})}
            </Button>
        </Stack>
        </div>
    );
}

export default Dates;