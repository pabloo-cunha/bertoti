import React, { useState } from 'react';
import Modal from 'react-modal';

const UserForm = ({ isOpen, onRequestClose, onAddUser }) => {
  const [formData, setFormData] = useState({
    name: '',
    lastName: '',
    cpf: '',
    birthday: '',
    // Adicione outros campos conforme necessário
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
    onAddUser(formData);
    setFormData({
      name: '',
      lastName: '',
      cpf: '',
      birthday: '',
      // Zere outros campos conforme necessário
    });
  };

  return (
    <Modal
      isOpen={isOpen}
      onRequestClose={onRequestClose}
      contentLabel="User Form Modal"
    >
      <form onSubmit={handleSubmit}>
        <label>
          Name:
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={handleChange}
          />
        </label>
        <label>
          Last Name:
          <input
            type="text"
            name="lastName"
            value={formData.lastName}
            onChange={handleChange}
          />
        </label>
        <label>
          CPF:
          <input
            type="text"
            name="cpf"
            value={formData.cpf}
            onChange={handleChange}
          />
        </label>
        <label>
          Birthday:
          <input
            type="date"
            name="birthday"
            value={formData.birthday}
            onChange={handleChange}
          />
        </label>
        {/* Adicione outros campos conforme necessário */}
        <button type="submit">Submit</button>
      </form>
    </Modal>
  );
};

export default UserForm;
