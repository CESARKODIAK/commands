class CreateVariables < ActiveRecord::Migration
  def change
    create_table :variables do |t|
      t.string :name
      t.string :default
      t.integer :context_id
      t.integer :kind_id
      t.integer :method_id

      t.timestamps
    end
  end
end
