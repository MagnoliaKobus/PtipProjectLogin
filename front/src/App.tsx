import './App.css';
import { Route, Routes } from 'react-router-dom';
import OAuth from 'views/Authenfication/OAuth';
import SignIn from 'views/Authenfication/SignIn';
import SignUp from 'views/Authenfication/SignUp';

function App() {


  return (
    <Routes>
      <Route path='/auth'>
        <Route path='sign-up' element={<SignUp />} />
        <Route path='sign-in' element={<SignIn />} />
        <Route path='oauth-response/:token/:expirationTime' element={<OAuth />} />
      </Route>
    </Routes>
  );
}

export default App;