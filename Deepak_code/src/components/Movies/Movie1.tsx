import React from "react";

import { useNavigate } from "react-router-dom";
import Dates from "../Dates";
const mystyle = {
    padding:"50px"
}



function Movie1() {
    const navigate = useNavigate();
    return (


        <div>
           <Dates/>
            <img className="image" src={require('../Images/RRR.jpeg')} alt={"icon"} height={300} width={200} style={mystyle}/>
        </div>
    )
}

export default Movie1;