import React, { useState } from 'react';
import MainPainel from "./MainPainel";

const Template = ({ children }) => {
    const [isMenuVisible, setMenuVisible] = useState(false);

    const toggleMenu = () => {
        setMenuVisible(!isMenuVisible);
    };

    const styles = {
        backgroundImage: `url(${process.env.PUBLIC_URL}/images/Leonardo_Vision_XL_Coffee_Shop_University_Studies_Birds_Trees_3.jpg)`,
        backgroundSize: 'cover',
        backgroundRepeat: 'no-repeat',
        height: '100vh',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center',
        color: 'white',
    };

    const cartIconStyles = {
        position: 'absolute',
        top: '0px',
        right: '20px',
        width: '75px',
        height: '75px',
        cursor: 'pointer',
    };

    const headerStyles = {
        position: 'absolute',
        top: '0',
        left: '0',
        right: '0',
        padding: '50px',
        backgroundColor: 'rgba(0, 0, 0, 0.4)',
        boxShadow: '0px 0px 10px rgba(0, 0, 0, 0.5)',
        zIndex: '2',
        display: 'flex',
        justifyContent: 'space-between',
        alignItems: 'center',
    };

    const logoStyles = {
        fontFamily: 'Cinzel, serif',
        fontSize: '2rem',
        fontWeight: 'bold',
        letterSpacing: '1px',
        textShadow: '2px 2px 4px rgba(0, 0, 0, 0.5)',
        color: '#fff',
        margin: '0',
    };

    const menuIconStyles = {
        width: '32px',
        height: '32px',
        cursor: 'pointer',
    };

    const menuStyles = {
        position: 'absolute',
        top: '70px',
        left: '20px',
        backgroundColor: 'rgba(0, 0, 0, 0.8)',
        padding: '10px',
        borderRadius: '5px',
        display: isMenuVisible ? 'block' : 'none',
    };

    const menuItemStyles = {
        margin: '5px 0',
        color: '#fff',
        cursor: 'pointer',
    };

    const entrarButton = {
        margin: '5px',
        fontFamily: 'Cinzel, serif',
        fontSize: '19px',
        boxShadow: '10px 10px 10px rgba(1, 1, 1, 1.5)'
    };

    return (
        <div style={styles}>
            <div style={headerStyles}>
                <div style={entrarButton}>
                    <text> Entrar </text>
                </div>
                <div style={{ flex: '1', textAlign: 'center' }}>
                    <h1 style={logoStyles}>Fatecando Coffee Shop</h1>
                </div>
                <div>
                    <img src={`${process.env.PUBLIC_URL}/images/icon-cart-shopping2-removebg-preview.png`} alt="Cart Shopping Icon" style={cartIconStyles} />
                </div>
            </div>
            <div style={menuStyles}>
                <div style={menuItemStyles}>Menu Item 1</div>
                <div style={menuItemStyles}>Menu Item 2</div>
                {/* Adicione outros itens de menu conforme necessário */}
            </div>
            <MainPainel/>
            {children}
        </div>
    );
};

export default Template;
