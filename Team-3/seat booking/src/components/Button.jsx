import React from "react";
import payment from "./payment";
import './styles/Button.css'
// import { useNavigate } from "react-router-dom";



const STYLES=[
    "btn--primary--solid",
]
const SIZES=[
    "btn--medium",
]
export const Button =({
    children, 
    type, 
    onClick, 
    buttonStyle, 
    buttonSize 
}) => {
    const checkButtonStyle = STYLES.includes(buttonStyle) ? buttonStyle : STYLES[0]
    const checkButtonSize = SIZES.includes(buttonSize) ? buttonSize : SIZES[0]
    // const navigate = useNavigate();
   
    return(
        <button className={`btn ${checkButtonStyle} ${checkButtonSize}`} onClick={onClick} type={type}>
            {children}
        </button>
        
    );
};