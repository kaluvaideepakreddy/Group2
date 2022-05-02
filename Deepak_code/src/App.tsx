import React from 'react';
import Home from "./components/Home";
import Navbar from "./components/Navbar";

import {BrowserRouter,Routes,Route} from "react-router-dom";

import Movie1 from "./components/Movies/Movie1";
import Movie2 from "./components/Movies/Movie2";
import Movie3 from "./components/Movies/Movie3";
import Movie4 from "./components/Movies/Movie4";
import Day2 from "./components/Days/Day2";
import Day3 from "./components/Days/Day3";
import Day4 from "./components/Days/Day4";
import Buttonarrangement from "./components/Days/Buttonarrangement";
import Login from "./components/Login";
import Signup from "./components/Signup";

function App() {
    return (
        <div>
            <BrowserRouter>
                <Navbar/>
                <Routes>
                    <Route path={'/'} element={<Home/>}/>
                    <Route path={'/login'} element={<Login/>}/>
                    <Route path={'/Signup'} element={<Signup/>}/>
                    <Route path={'/Movie1'} element={<Movie1/>}/>
                    <Route path={'/Movie2'} element={<Movie2/>}/>
                    <Route path={'/Movie3'} element={<Movie3/>}/>
                    <Route path={'/Movie4'} element={<Movie4/>}/>
                    <Route path={'/day1'} element={<Buttonarrangement/>}/>
                    <Route path={'/day2'} element={<Day2/>}/>
                    <Route path={'/day3'} element={<Day3/>}/>
                    <Route path={'/day4'} element={<Day4/>}/>
                </Routes>
            </BrowserRouter>
        </div>

    );
}

export default App;
