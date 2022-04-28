import React from "react";

function Detail({ selected, closeDetail }) {
    return (
        <section className="detail">
            <div className="content">
                <h2>{selected.title}</h2>
                <span>{selected.yearr}</span>
                <p className="rating">Rating: {selected.imDbRating}</p>
                <p className="year">Year: {selected.year}</p>
                
                <div className="about">
                    <img src={selected.image} alt="" />
                    <div className="info">
                        <p>{selected.plot}</p>
                        <br/>
                        <p>{selected.stars}</p>
                        <br/>
                        <p>Directors: {selected.directors}</p>
                    </div>

                </div>
                <button className="close" onClick={closeDetail}>
                    Close
                </button>
            </div>
        </section>
    );
}

export default Detail;
