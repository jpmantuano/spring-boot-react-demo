import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import registerServiceWorker from './registerServiceWorker';
import ClientList from './ClientList'

class Doc extends React.Component{
    componentDidMount(){
    document.title = "dfsdfsdfsd"
  }

  render(){
    return(
            <b> test </b>
      )
  }
}

ReactDOM.render(  <ClientList />, document.getElementById('root'));
//registerServiceWorker();
