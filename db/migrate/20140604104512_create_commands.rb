class CreateCommands < ActiveRecord::Migration
  def change
    create_table :commands do |t|
      t.integer :context_id
      t.text :description
      t.string :pattern
      t.text :action
      t.integer :type_id
      t.text :examples
      t.integer :user_id
      t.integer :parent_id

      t.timestamps
    end
  end
end
