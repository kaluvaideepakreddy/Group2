import React, { useState } from "react";
import axios from "axios";
import Search from "./Search";
import Results from "./Results";
import Detail from "./Detail";
import Report from "./report"
import ReportForm from "./reportForm";
import "./App.css";

function App() {
  const [state, setState] = useState({
    s: "sherlock",
    results: [],
    selected: {},
    show: false
  });

  const apiurl = "https://imdb-api.com/en/API/SearchMovie/k_3nae07aw/";

  const searchInput = (e) => {
    let s = e.target.value;

    setState((prevState) => {
      return { ...prevState, s: s };
    });
  };

  const search = (e) => {
    if (e.key === "Enter") {
      axios(apiurl + state.s).then(({ data }) => {
        let results = data.results;
        console.log("jshdj")
        console.log(results);

        setState((prevState) => {
          return { ...prevState, results: results };
        });
      });
    }
  };

  const openDetail = (id) => {
    let url="https://imdb-api.com/en/API/Title/k_3nae07aw/"+id+"/Ratings"
    axios(url).then(({ data }) => {
      let result = data;
      console.log("working")
      setState((prevState) => {
        console.log(result)
        return { ...prevState, selected: result };
      });
    });
  };

const reportFrom=()=>{
  setState((prevState)=>{
    console.log()
    return { ...prevState, show: true}
  })
}

  const closeDetail = () => {
    setState((prevState) => {
      return { ...prevState, selected: {} };
    });
  };

  const calculateExpenses=(tickets,cancelled,p)=>{
    tickets=Number(tickets)
    let price=250
    cancelled=Number(cancelled)
    let result=(tickets*price)-(0.2*cancelled*price)
    console.log(p)
    let val="Total expenses: Rs. "+result
    p.innerText=val
  }


  const closeForm=()=>{
    setState((prevState)=>{
      return{ ...prevState, show: false}
    })
  }
  return (
      <div className="App">
        <header className="App-header">
          <h1>Movie Mania</h1>
        </header>
        <main>
          <Search searchInput={searchInput} search={search} />

          <Results results={state.results} openDetail={openDetail} />
          <Report reportForm={reportFrom} show={false}/>

          {typeof state.selected.title != "undefined" ? (
              <Detail selected={state.selected} closeDetail={closeDetail} />
          ) : (
              false
          )}
          {/* <ReportForm  /> */}
          {
            state.show ? (
              <ReportForm calculateExpenses={calculateExpenses} closeForm={closeForm} />
              // <ReportForm  test={state.selected.show}  />
              ):(
                false
            )
          }
        </main>
      </div>
  );
}

export default App;
