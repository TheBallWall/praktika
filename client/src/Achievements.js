import React, {Component} from "react";
import Block from "./Block";

class Achievements extends Component {
    constructor(props) {
        super(props);
        this.state = {
            isFetching: false,
            achievements: []
        };
    }

    componentDidMount() {
            this.setState({...this.state, isFetching: true});
            fetch('http://localhost:8080/api/achievements/all', {
                method: 'GET',
                headers: {'Content-Type': 'application/json'}
            })
                .then((response) => {
                    return response.json();
                })
                .then(data => {
                    this.setState({achievements: data, isFetching: false});
                    console.log(data);
                })
                .catch(e => {
                    console.log(e);
                    this.setState({...this.state, isFetching: false});
                });
    }

    render() {
        let {achievements} = this.state
        return (
            <div className="App-dashboard">
                {achievements.map(achievement=>(
                    <Block
                        name={achievement.name}
                        text={achievement.text}
                        type="Achievement"
                    />
                ))}
            </div>
        );
    }
}

export default Achievements;