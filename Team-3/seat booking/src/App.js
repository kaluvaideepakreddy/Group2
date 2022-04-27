import React, {useState} from "react"
import "./App.css"

import MovieSelector from "./components/MovieSelector"
import SeatAvailability from "./components/SeatAvailability"
import SeatMatrix from "./components/SeatMatrix"
import PriceCalculator from "./components/PriceCalculator"
import GithubLogo from './components/GithubLogo'

import MovieContext from './contexts/MovieContext'

const App = () => {

	const [movies, EditMovies] = useState({
		movieNames: {
			RRR: 250,
			KGF: 300,
			ACHARYA: 300,
			"RADHE SHYAM": 150,
			PUSHPA: 120
		},
		moviePrice: 120,
		totalSeats: 0,
		seatNumbers: []
	})

	return (
		<div className="main container">
			<MovieContext.Provider value={{ movies, changeState: EditMovies }}>
			
				<MovieSelector />
				<SeatMatrix />
				<SeatAvailability />
				<PriceCalculator />
			</MovieContext.Provider>
		</div>
	)
}

export default App
