// @ts-nocheck
const taskForm = document.getElementById('taskForm');
const taskList = document.getElementById('taskList');

taskForm.addEventListener('submit', function(e) {
    e.preventDefault();

    const title = document.getElementById('title').value.trim();
    const description = document.getElementById('description').value.trim();

    if (title === "" || description === "") return;

    const tr = document.createElement('tr');

    const tdTitle = document.createElement('td');
    tdTitle.textContent = title;

    const tdDescription = document.createElement('td');
    tdDescription.textContent = description;

    const tdDelete = document.createElement('td');
    const deleteBtn = document.createElement('button');
    deleteBtn.textContent = "X";
    deleteBtn.addEventListener('click', () => tr.remove());
    tdDelete.appendChild(deleteBtn);

    tr.appendChild(tdTitle);
    tr.appendChild(tdDescription);
    tr.appendChild(tdDelete);

    taskList.appendChild(tr);

    // Reset form
    taskForm.reset();
});
