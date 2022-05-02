import React from "react";

import Dates from "../Dates";
import Buttonarrangement from "../Days/Buttonarrangement";
const mystyle = {
    padding:"50px"
}

function Movie2(){
    return(
        <div>
            <Dates/>
            <img className="image" src={require('../Images/pushpa.jpeg')} alt={"icon"} height={300} width={200} style={mystyle}/>
        </div>
    )
}

export default Movie2;