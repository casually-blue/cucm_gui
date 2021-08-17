import React from "react";
import './App.css';

export default class JsonTable extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            json: null,
            isLoaded: false,
        };
    }

    componentDidMount() {
        fetch(this.props["url"])
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        isLoaded: true,
                        json: result
                    })
                }
            )
    }

    render(){
        if(this.state.isLoaded){
            return (
                <table>
                    <thead className="TableHead">
                    <tr>
                        <th key={"index"} className="TableHead">Index</th>
                        {
                            Object.keys(this.state.json[0]).map(function(key) {
                                return <th key={key} className="TableHead">{key.charAt(0).toUpperCase() + key.slice(1)}</th>
                            })
                        }
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.json.map(function(obj, index) {
                            return <tr key={index}>
                                <td key={"index"} className="TableCell">{index}</td>
                                {
                                    Object.keys(obj).map(function (key) {
                                        if((obj[key] || "none").toString() === "object"){
                                            return <td key={key} className="TableCell">null</td>
                                        } else {
                                            return <td key={key} className="TableCell">{(obj[key] || "none").toString()}</td>
                                        }
                                    })
                                }
                            </tr>
                        })
                    }
                    </tbody>
                </table>
            );
        } else {
            return <p>Loading...</p>
        }
    }
}