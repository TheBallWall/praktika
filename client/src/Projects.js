import React, {Component} from "react";
import Block from "./Block";

class Projects extends Component {
    constructor(props) {
        super(props);
        this.state = {
            isFetching: false,
            projects: []
        };
    }

    componentDidMount() {
            this.setState({...this.state, isFetching: true});
            fetch('http://localhost:8080/api/projects/all', {
                method: 'GET',
                headers: {'Content-Type': 'application/json'}
            })
                .then((response) => {
                    return response.json();
                })
                .then(data => {
                    this.setState({projects: data, isFetching: false});
                    console.log(data);
                })
                .catch(e => {
                    console.log(e);
                    this.setState({...this.state, isFetching: false});
                });
    }

    render() {
        let {projects} = this.state
        return (
            <div className="App-dashboard">
                {projects.map(project=>(
                    <Block
                        name={project.name}
                        text={project.text}
                        type="Project"
                    />
                ))}
            </div>
        );
    }
}

export default Projects;