import React from "react";


function ReportForm({calculateExpenses,closeForm}){
    return(

        <section className="report-form">
            <h1 className="heading">Generate Expense Report</h1>
            <label htmlFor="date">from:</label>
            <input type="date" name='fromDate'  />
            <label htmlFor="date">To:</label>
            <input type="date" name='toDate'/>
            <br />
            <label htmlFor="">No of tickets booked</label>
            <input type="number" min={0} id='tickets' name='noOfTickets' />            
            <label htmlFor="">Price per ticket</label>
            <input type="text" value='Rs.250' id='price' disabled />
            <label htmlFor="">No of tickets cancelled</label>
            <input type="number" name='noOfCancelled' id="cancelled" />
            <p>Cancellation charge <b>20%</b></p>
            <button className="generateButton" onClick={()=>calculateExpenses(document.getElementById('tickets').value,
                                                                                    document.getElementById('cancelled').value,
                                                                                    document.getElementById('expenses')
            )}>Generate</button>
            <button className="closeButton" onClick={()=>{closeForm()}} >Close</button>
            <p className="message" id='expenses'></p>
        </section>
    )
}

export default ReportForm