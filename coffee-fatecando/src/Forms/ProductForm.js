import React, { useState } from 'react';
import Modal from 'react-modal';

const ProductForm = () => {
  const [modalIsOpen, setModalIsOpen] = useState(false);
  const [formData, setFormData] = useState({
    title: '',
    description: '',
    intensity: '',
    price: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Lógica para enviar os dados para a API ou fazer qualquer outra ação necessária
    console.log(formData);
    setModalIsOpen(false); // Fechar o modal após o envio
  };

  return (
    <div>
      <button onClick={() => setModalIsOpen(true)}>Open Form</button>

      <Modal
        isOpen={modalIsOpen}
        onRequestClose={() => setModalIsOpen(false)}
        contentLabel="Product Form Modal"
      >
        <form onSubmit={handleSubmit}>
          {/* Restante do formulário aqui */}
        </form>
      </Modal>
    </div>
  );
};

export default ProductForm;
