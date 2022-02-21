import React, {Component} from "react";
import logo from './logo.svg';
import './App.css';
import Achievements from "./Achievements";
import Projects from "./Projects";

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            type:'Achievements'
        };
    }

    switchType = (event) => {
        this.state.type === "Achievements" ?
            this.setState({...this.state, type: "Projects"}):
            this.setState({...this.state, type: "Achievements"})
    }

    render() {
        let {type} = this.state;
        return (
            <div className="App">
                <header className="App-header">
                    <p>Portfolio</p>
                </header>
                <p>This page contains brief information about relevant achievements and projects of a person</p>

                    <button className="App-button" onClick = {this.switchType}>
                        {type === "Achievements" ? "Achievements" : "Projects"}
                    </button>
                {type === "Achievements" && <Achievements/>}
                {type === "Projects" && <Projects/>}
            </div>
        );
    }
}
export default App;
