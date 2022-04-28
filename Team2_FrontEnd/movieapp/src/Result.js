import React from "react";

function Result({ result, openDetail }) {
    return (
        <div className="result" onClick=
            {() => openDetail(result.id)}>
            <img src={result.image} alt=' not found' />
            <h3>{result.title}</h3>
        </div>
    );
}

export default Result;
