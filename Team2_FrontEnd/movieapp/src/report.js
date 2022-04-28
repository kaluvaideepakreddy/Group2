import React from "react";

function Report({reportForm}){
    return(
        <section className="report">
            <button className="expense-report" onClick={()=>(reportForm())}>
                Expense Report
            </button>
        </section>
    )
}

export default Report