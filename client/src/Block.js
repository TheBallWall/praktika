import React, {Component} from "react";

class Block extends Component {
    constructor(props) {
        super(props);
        this.state = {
            name: props.name,
            text: props.text,
            type: props.type
        };
    }

    render() {
        let {name, text, type} = this.state;
        return (
            <div className="App-block" style={{"background-color": type === "Achievement" ? "#003153" : "#cc7722"}}>
                <p>{name}</p>
                <p>{text}</p>
            </div>
        );
    }
}

export default Block;