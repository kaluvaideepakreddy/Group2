import React from "react";
import Dates from "../Dates";
import Buttonarrangement from "../Days/Buttonarrangement";
const mystyle = {
    padding:"30px",
}
function Movie4(){
    return(
        <div>
           <Dates/>
            <img className="image" src={require('../Images/BB2.jpeg')} alt={"icon"} height={300} width={200} style={mystyle}/>
        </div>
    )
}

export default Movie4;