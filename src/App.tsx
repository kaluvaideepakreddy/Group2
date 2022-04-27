import React, {Fragment} from 'react';
import {BrowserRouter,Routes,Route} from "react-router-dom";
import Navbar from "./Navbar";
import Login from "./Login";
import Home from "./Home";
import Signup from"./Signup"
import Movie1 from "./Movie1";
import Movie2 from "./Movie2";
import Movie3 from "./Movie3";
import Movie4 from "./Movie4";

import Dates from "./Dates";
import MaterialForm from "./Signup";
import Day2 from "./Day2";
import Day3 from "./Day3";
import Day1 from "./Day1";
import Day4 from "./Day4";
import Day5 from "./Day5";
import Day6 from "./Day6";
import Day7 from "./Day7";
import Homepage from "./Homepage";


function App() {
    return (


        <BrowserRouter>

            <Routes>

                <Route path={'/'} element={<Home/>}/>
                <Route path={'/Login'} element={<Login/>}/>
                <Route path={'/Signup'} element={<Signup/>}/>
                <Route path={'/Homepage'} element={<Homepage/>}/>
                <Route path={'/Day1'} element={<Day1/>}/>
                <Route path={'/Day2'} element={<Day2/>}/>
                <Route path={'/Day3'} element={<Day3/>}/>
                <Route path={'/Day4'} element={<Day4/>}/>
                <Route path={'/Day5'} element={<Day5/>}/>
                <Route path={'/Day6'} element={<Day6/>}/>
                <Route path={'/Day7'} element={<Day7/>}/>
                <Route path={'/Movie1'} element={<Movie1/>}/>
                <Route path={'/Movie2'} element={<Movie2/>}/>
                <Route path={'/Movie3'} element={<Movie3/>}/>
                <Route path={'/Movie4'} element={<Movie4/>}/>

            </Routes>
        </BrowserRouter>
    );
}

export default App;
