class CreateContexts < ActiveRecord::Migration
  def change
    create_table :contexts do |t|
      t.string :name
      t.integer :parent_id
      t.text :description

      t.timestamps
    end
  end
end
