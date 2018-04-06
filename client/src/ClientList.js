import React from 'react';
import 'whatwg-fetch';
import 'bootstrap/dist/css/bootstrap.min.css';


class ClientList extends React.Component {

    constructor(props) {
        super(props);
        this.state = { clients: [] };
    }

	componentDidMount() {
		fetch('/client', {
          headers : {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
          }
		})
		.then((response) => response.json())
		.then(data => this.setState({ clients: data }));
	}

	render() {
	    const { clients } = this.state;

		return (
          <div className="container">
            <h2>Client List</h2>
              <table className="table table-striped">
                <thead>
                    <tr>
                    <th>Name</th>
                    <th>ID</th>
                    <th>Delete</th>
                    </tr>
                </thead>
                {clients.map((client: any) =>
                    <tbody>
                    <td>{client.name}</td>
                    <td>{client.code}</td>
                    <td><a>X</a></td>
                    </tbody>
                )}
              </table>
          </div>
		)
	}
}

export default ClientList;